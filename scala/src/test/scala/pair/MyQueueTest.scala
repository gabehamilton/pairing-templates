package pair

class MyQueueTest extends org.scalatest.FunSuite {
  var queue: MyQueue = _

  test("new queue is empty") {
    queue = new MyQueue
    assert(queue.size == 0)
  }
}
