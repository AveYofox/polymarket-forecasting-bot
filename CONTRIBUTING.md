

# Contributing to LeetCode Daily October Hacktoberfest 2024

Thank you for your interest in contributing to the **LeetCode Daily October Hacktoberfest Challenge 2024**! Your contributions help us create a robust and diverse set of solutions for LeetCode’s daily challenges in various programming languages. This guide will help you get started with contributing.

## Table of Contents

- [How to Contribute](#how-to-contribute)
  - [Fork the Repository](#fork-the-repository)
  - [Clone the Repository](#clone-the-repository)
  - [Work on Your Contribution](#work-on-your-contribution)
  - [Create a Pull Request](#create-a-pull-request)
- [Contribution Guidelines](#contribution-guidelines)
  - [Code Quality](#code-quality)
  - [Documentation](#documentation)
  - [Languages Supported](#languages-supported)
  - [Testing Your Solution](#testing-your-solution)
- [Pull Request Review Process](#pull-request-review-process)
- [Reporting Issues](#reporting-issues)

---

## How to Contribute

We are excited to have you contribute! Follow the steps below to add your solutions or improve the project.

### 1. Fork the Repository

Start by **forking** this repository. Forking will create a copy of the repository under your GitHub account where you can make your changes. You can fork the repository by clicking on the "Fork" button at the top-right of the [repository page](https://github.com/arya2004/leetcode-daily-october-hacktoberfest-2024).

### 2. Clone the Repository

After forking, clone the repository to your local machine so you can work on it.

```bash
git clone https://github.com/your-username/leetcode-daily-october-hacktoberfest-2024.git
```

Make sure to replace `your-username` with your actual GitHub username.

### 3. Work on Your Contribution

Navigate to the appropriate directory for the day you want to contribute a solution for:

```bash
cd solutions/dayXX
```

Where `dayXX` is the folder for the day's problem you're solving (e.g., `day01`, `day02`, etc.). Add your solution file in one of the preferred programming languages (or another language if you'd like):

- **Python**: `solution_python.py`
- **Java**: `solution_java.java`
- **C++**: `solution_cpp.cpp`

If you're adding a solution in a different language, feel free to create a new file, like `solution_ruby.rb`.

Once you've added your solution, create or update the `README.md` file within that day's folder to describe your approach to solving the problem. Make sure to document the following:

- The **problem statement** (if not already present in the folder).
- A brief **explanation of your solution** and approach.
- Any additional **comments** on time/space complexity or optimizations (if applicable).

### 4. Create a Pull Request

Once you're satisfied with your solution and documentation:

1. **Commit** your changes:

   ```bash
   git add .
   git commit -m "Add solution for Day XX problem in Python"
   ```

2. **Push** your changes to your forked repository:

   ```bash
   git push origin main
   ```

3. Navigate to the original repository on GitHub, and you should see an option to **Compare & pull request**. Click it and create your **pull request** (PR).

   - In the PR description, mention the day and language you're submitting for (e.g., "Solution for Day 3 in C++").
   - Optionally, mention any edge cases you handled or special insights about your approach.

We will review your PR as soon as possible and merge it if everything looks good.

---

## Contribution Guidelines

### Code Quality

Please ensure that your code is:

- **Well-structured** and follows coding conventions for the chosen language.
- **Efficient**, aiming for the best time and space complexity possible.
- **Readable** with meaningful comments and clear variable/function names.

### Documentation

In each day's `README.md` file, document your approach, optimizations, and complexity analysis if applicable. This helps others learn from your solution. You can also include pseudocode or a breakdown of your thought process.

### Languages Supported

We primarily support solutions in:

- **Python**
- **Java**
- **C++**

However, contributions in other languages are welcome, such as JavaScript, Go, Ruby, or Rust. Just make sure your solution works correctly in the language of your choice.

### Testing Your Solution

Before submitting, ensure that:

1. Your solution is working correctly by testing it against the problem's example cases and any edge cases you can think of.
2. You include meaningful **comments** to explain the logic, especially if your solution involves complex algorithms or techniques.

---

## Pull Request Review Process

Once you open a pull request:

1. The maintainers will review your code to ensure it follows the project's guidelines.
2. If changes are required, we will leave feedback, and you can update your PR.
3. Once approved, the PR will be merged into the main repository.

If you’re not sure how to address feedback or need help, feel free to ask questions in the PR discussion.

---

## Reporting Issues

If you notice any issues or problems with the repository, such as:

- **Bugs** in existing solutions
- Incorrect problem statements
- Suggestions for new features

Feel free to open a new issue! We have templates for reporting daily problems and feature requests. You can use these templates to describe your issue clearly.

To report an issue, go to the **Issues** tab of the repository and click **New Issue**. Choose the appropriate template and fill it out with relevant details.

---

Thank you for contributing to **LeetCode Daily October Hacktoberfest 2024**! Every contribution, no matter how small, helps grow our community and makes this project better. We look forward to your participation and solutions!

