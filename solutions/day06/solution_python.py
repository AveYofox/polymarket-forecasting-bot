class Solution:
    def areSentencesSimilar(self, sentence_1: str, sentence_2: str) -> bool:
        # Split the sentences into words
        sentence_1_split = sentence_1.split()
        sentence_2_split = sentence_2.split()

        # Ensure sentence_1_split is the longer or equal length sentence
        if len(sentence_2_split) > len(sentence_1_split):
            sentence_1_split, sentence_2_split = sentence_2_split, sentence_1_split

        l, r = 0, 0
        sen_1_len, sen_2_len = len(sentence_1_split), len(sentence_2_split)

        # Count matching words from the start
        while l < len(sentence_2_split) and sentence_1_split[l] == sentence_2_split[l]:
            l += 1

        # Count matching words from the end
        while r < len(sentence_2_split) and sentence_1_split[sen_1_len - 1 - r] == sentence_2_split[sen_2_len - 1 - r]:
            r += 1

        # Check if the total number of matching words is at least the length of the shorter sentence
        return l + r >= sen_2_len




import unittest

class TestSolution(unittest.TestCase):
    def setUp(self):
        self.solution = Solution()

    def test_are_sentences_similar(self):
        # Test cases
        self.assertTrue(self.solution.areSentencesSimilar("My name is Jack", "My name is"))
        self.assertTrue(self.solution.areSentencesSimilar("Hello world", "Hello"))
        self.assertFalse(self.solution.areSentencesSimilar("Hello world", "world Hello"))
        self.assertTrue(self.solution.areSentencesSimilar("I love programming", "I love"))
        self.assertFalse(self.solution.areSentencesSimilar("I love programming", "programming love I"))

if __name__ == '__main__':
    unittest.main()