package leetcode_project

import (
	"regexp"
	"strings"
)

func isPalindrome(s string) bool {
    left, right := 0, len(s)-1

    for left < right {
		// Skip non-alphanumeric characters from the left
        if !isAlphanumeric(string(s[left])) {
            left += 1
		// Skip non-alphanumeric characters from the right
        } else if !isAlphanumeric(string(s[right])) {
            right -= 1
        } else {
			 // Compare characters (case-insensitive)
            if strings.ToLower(string(s[left])) != strings.ToLower(string(s[right])) {
                return false
            }
			 // Move both pointers inward
            left += 1
            right -= 1
        }
    }
    return true
}

func isAlphanumeric(str string) bool {
    var alphanumeric = regexp.MustCompile("^[a-zA-Z0-9]*$")
    return alphanumeric.MatchString(str)
}