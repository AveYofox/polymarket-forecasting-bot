class Solution:
    def dividePlayers(self, skill):
        n = len(skill)
        skill.sort()  # Sort the skill array
        ans = 0
        i = 0
        j = n - 1
        k = skill[i] + skill[j]  # Target sum for each pair

        while i < j:
            if skill[i] + skill[j] != k:  # Check if current pair sum matches target
                return -1
            ans += skill[i] * skill[j]  # Add the product of the current pair
            i += 1
            j -= 1

        return ans
