package subtask4

class StringParser {

    fun getResult(inputString: String): Array<String> {

        val resultString = ArrayList<String>()
        val brackets = listOf('<', '(', '[', '>', ')', ']')
        val stringBuilder = StringBuilder(inputString)

        for (n in stringBuilder.length - 1 downTo 0) {
            if (stringBuilder[n] in brackets.subList(0, 3)) {
                var lastIndex = 0
                for (m in n until stringBuilder.length) {
                    if (stringBuilder[m] == brackets[brackets.indexOf(inputString[n]) + 3]) {
                        lastIndex = m
                        stringBuilder[n] = '|'
                        stringBuilder[lastIndex] = '|'
                        break
                    }
                }
                resultString.add(0, inputString.substring(n + 1, lastIndex))
            }
        }
        return resultString.toTypedArray()
    }

}
