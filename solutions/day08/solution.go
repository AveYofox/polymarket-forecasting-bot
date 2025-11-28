package leetcode_project

import (
	"regexp"
	"strings"
)

func isPalindrome(s string) bool {
    left, right := 0, len(s)-1

    for left < right {
        if !isAlphanumeric(string(s[left])) {
            left += 1
        } else if !isAlphanumeric(string(s[right])) {
            right -= 1
        } else {
            if strings.ToLower(string(s[left])) != strings.ToLower(string(s[right])) {
                return false
            }
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