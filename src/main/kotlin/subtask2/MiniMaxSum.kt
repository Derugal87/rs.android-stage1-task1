package subtask2

class MiniMaxSum {
    fun getResult(input: IntArray): IntArray {
        return arrayOf(input.sum() - (input.max() ?: 0), input.sum() - (input.min() ?: 0)).toIntArray()
    }
}
