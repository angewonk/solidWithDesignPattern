## Problem Scenario

The NEU Library offers a variety of resource, including books, theses, capstones, internet access, journals, and newspapers.

Currently, the Student object has methods like borrowBook(), borrowJournal() with a parameter of title, which directly depend on specific resource types.

To adhere to the Dependency Inversion Principle (DIP) and ensure flexibility for future changes (such as introducing audio books or e-journals), we need to refactor the program while maintaining SOLID principles. The goal is to create a robust system that can seamlessly accommodate new resource types in the future.

Your solution should not violate other SOLID principles.

Make sure you have a TestProgram that will validate the proposed refactored codes.

## Class Diagram
![solid with design](https://github.com/angewonk/solidWithDesignPattern/assets/142864286/7d7cea14-7017-4108-b443-60d4d204e515)
