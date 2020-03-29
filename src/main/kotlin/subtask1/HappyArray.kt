package subtask1

class HappyArray {
    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        val happyArray: ArrayList<Int> = ArrayList(sadArray.asList())
        var n = 1
            while (n < (happyArray.size - 1)) {
                if (happyArray[n - 1] + happyArray[n + 1] < happyArray[n]) {
                    happyArray.removeAt(n)
                    if (n != 1)
                    n--
                }   else
                    n++
            }
        return happyArray.toIntArray()
        }

}
