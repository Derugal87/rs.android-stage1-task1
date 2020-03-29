package subtask5


//* n - the maximum number of changes allowed
//* k - the maximum number of changes allowed
//* digitString - String of numbers that Sandy must attempt to make palindromic

class HighestPalindrome {

    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        val charArray = digitString.toCharArray()
        var value = 0
        for (i in charArray.indices) {
            if (i > n / 2) break
            if (charArray[i] != charArray[n - i - 1]) {
                if (charArray[i] == '0') {
                    charArray[i] = '9'
                }
                charArray[n - i - 1] = charArray[i]
                value++
            } else if (value > k) {
                return "-1"
            }
        }
        return String(charArray)
    }
}
