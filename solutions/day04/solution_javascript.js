/**
 * @param {number[]} skillLevels
 * @return {number}
 */
var dividePlayers = function(skillLevels) {
    skillLevels.sort((a, b) => a - b);
    
    let numPlayers = skillLevels.length;
    let requiredSum = skillLevels[0] + skillLevels[numPlayers - 1];
    let totalChemistry = 0;

    for (let i = 0; i < numPlayers / 2; i++) {
        if (skillLevels[i] + skillLevels[numPlayers - i - 1] !== requiredSum) {
            return -1;
        }
        totalChemistry += skillLevels[i] * skillLevels[numPlayers - i - 1];
    }

    return totalChemistry;
};
