/**
 * @param {string} s
 * @return {number}
 */
const minimumSteps = function(s) {
    let countSteps = 0;
    let numberOfOnes = 0;
    for (let i = 0; i < s.length; i++) {
    // Increment number of 1s found
        if (s[i] === '1') {
            numberOfOnes++;
        } else {
        // Increment the swap counter
            countSteps += numberOfOnes;
        }
    }
    return countSteps;
};