class Solution:
    def minimumLengthEncoding(self, words):
        # Sort words by length in descending order
        words.sort(key=len, reverse=True)
        encoded_length = 0
        suffix_map = {}

        # Create a map of suffixes
        for word in words:
            for i in range(len(word)):
                suffix = word[i:]
                suffix_map[suffix] = suffix_map.get(suffix, 0) + 1

        # Calculate the length of the shortest encoding
        for word in words:
            if suffix_map[word] == 1:  # Only consider unique words
                encoded_length += len(word) + 1  # +1 for the '#' character

        return encoded_length
