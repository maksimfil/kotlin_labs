import java.util.*

class QueueImpl<T : Any> : Queue<T> {
    private val elements: ArrayList<T> = ArrayList()

    override fun enqueue(element: T): Boolean {
        elements.add(element)
        return true
    }

    override fun dequeue(): T? {
        return if (isEmpty) {
            null
        } else {
            elements.removeAt(0)
        }
    }

    override val count: Int
        get() = elements.size

    override fun peek(): T? {
        return if (isEmpty) {
            null
        } else {
            elements[0]
        }
    }
}
fun main() {
    val taskQueue = QueueImpl<String>()
    taskQueue.enqueue("Завдання 1")
    taskQueue.enqueue("Завдання 2")
    taskQueue.enqueue("Завдання 3")
    taskQueue.dequeue()
    println(taskQueue.peek())
    println(taskQueue.count)
}