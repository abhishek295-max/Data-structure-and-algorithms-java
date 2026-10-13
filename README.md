# DSA, Design Patterns & Low-Level Design in Java

A structured, self-paced learning route for becoming job-ready in **data structures and algorithms**, **design patterns**, and **Low-Level Design (LLD)**, using Java.

Each topic follows the same loop: **read the theory, type the example, predict the output, solve the practice questions, log your mistakes, and review them later.**

---

## Who this is for

- Developers who know Java basics (classes, loops, arrays, collections) and want to crack product-company interviews.
- Learners who can write code but struggle to choose the right data structure or to design classes cleanly.
- Anyone preparing for MNC placements or backend roles.

**Prerequisites:** Java basics, the difference between `==` and `equals`, and basic recursion. OOP fundamentals (encapsulation, inheritance, polymorphism, abstraction, SOLID) are covered in the companion repo listed below and are strongly recommended before the design section.

---

## The learning route at a glance

```
Phase 0  Foundations            ──>  OOP and Java essentials
Phase 1  Core DSA               ──>  arrays, strings, linked lists, stacks, queues, binary search
Phase 2  Advanced DSA           ──>  trees, graphs, heaps, intervals
Phase 3  Algorithm paradigms    ──>  dynamic programming, backtracking
Phase 4  Design patterns        ──>  creational, structural, behavioral, dependency injection
Phase 5  Low-Level Design       ──>  10 core problems + extra problems
Phase 6  Revision and mocks     ──>  spaced review, timed contests, mock interviews
```

| Phase | Duration (suggested) | Daily time | Milestone |
|---|---|---|---|
| 0. Foundations | 1 to 2 weeks | 1 hour | Write classes with encapsulation and inheritance without help |
| 1. Core DSA | 4 to 5 weeks | 1.5 hours | Solve 40 easy and medium problems on arrays, strings, lists, and binary search |
| 2. Advanced DSA | 4 to 5 weeks | 1.5 hours | Solve trees, graphs, and heap problems within 40 minutes each |
| 3. Paradigms | 4 to 5 weeks | 2 hours | Derive a DP recurrence and a backtracking template on paper first |
| 4. Design patterns | 2 to 3 weeks | 1 hour | Implement 18 patterns and name the force each one solves |
| 5. LLD | 4 to 6 weeks | 2 hours | Design and code 10+ systems with tests and extension notes |
| 6. Revision and mocks | Ongoing | 1 hour | Two mock interviews per week, one timed contest per week |

Total: roughly **5 to 6 months** at the suggested pace. If you have less time, keep the daily habit and extend the phases rather than skipping them.

---

## Repository structure

```
dsa-lld-practice/
├── README.md                 <- this file
├── mistakes-log.md           <- one line per bug or wrong idea
├── pattern-notebook.md       <- problem -> pattern -> one-line reason
├── scripts/
│   ├── setup.sh              <- creates the folder tree
│   └── run.sh                <- runs one Main.java:  ./scripts/run.sh path/to/Main.java
├── dsa/
│   ├── 01_arrays_strings/          easy/  medium/  hard/
│   ├── 02_linked_list_stack_queue/ easy/  medium/  hard/
│   ├── 03_binary_search/           easy/  medium/  hard/
│   ├── 04_trees/                   easy/  medium/  hard/
│   ├── 05_graphs/                  easy/  medium/  hard/
│   ├── 06_heaps_intervals/         easy/  medium/  hard/
│   ├── 07_dynamic_programming/     easy/  medium/  hard/
│   └── 08_backtracking/            easy/  medium/  hard/
├── patterns/
│   ├── creational/           Singleton, Factory, Abstract Factory, Builder, Prototype
│   ├── structural/           Adapter, Decorator, Facade, Proxy, Composite
│   ├── behavioral/           Strategy, Observer, State, Command, Template Method, Chain, Iterator
│   └── di/                   dependency injection by hand
└── lld/
    ├── 01_parking_lot/
    ├── 02_lru_cache/
    ├── 03_rate_limiter/
    ├── 04_elevator/
    ├── 05_library/
    ├── 06_notification_service/
    ├── 07_tic_tac_toe/
    ├── 08_vending_machine/
    ├── 09_bookmyshow/
    └── 10_splitwise/
```

Each problem or LLD project is a folder containing:

- `Main.java`: your attempt, with a `main` method that prints expected output.
- `notes.md`: the pattern, the complexity, what went wrong, and what you learned.

Keep solutions out of your repo until you have made a real attempt.

---

## Setup

Requirements: **JDK 17 or newer** (JDK 21 recommended). No build tool is needed.

```bash
git clone https://github.com/<your-username>/dsa-lld-practice.git
cd dsa-lld-practice
chmod +x scripts/*.sh
./scripts/run.sh dsa/01_arrays_strings/easy/E01_TwoSum/Main.java
```

Java 11+ runs a single source file directly with `java Main.java`. The class that contains `main` must be the first top-level class in the file.

---

## Phase 0: Foundations

- [ ] Classes, objects, constructors, `this`, `static`
- [ ] Stack vs heap, references, pass-by-value
- [ ] `equals`, `hashCode`, `toString`
- [ ] Generics basics, `Comparable` and `Comparator`
- [ ] The four pillars of OOP and SOLID (see the companion OOP notes)

**Practice:** write a `BankAccount` with private state, validated operations, and a `transfer` method.

---

## Phase 1: Core DSA

### 1.1 Arrays and strings
Topics: two pointers, sliding window (fixed and variable), prefix sums, difference arrays, hashing, Kadane, Dutch national flag, in-place modification, matrix traversal, anagrams, palindromes, KMP and Rabin-Karp intro, `StringBuilder`.

- [ ] Two pointers: sorted pair sum, container with most water
- [ ] Sliding window: longest substring, minimum window
- [ ] Prefix sums and difference arrays
- [ ] Kadane's algorithm and its proof
- [ ] Matrix spiral and rotation

### 1.2 Linked lists, stacks, queues
Topics: reversal, fast and slow pointers, merge with dummy node, monotonic stack, min stack, valid parentheses, queue via stacks, deque, sliding window maximum, LRU cache.

- [ ] Reverse a list iteratively and recursively
- [ ] Detect a cycle and find where it starts
- [ ] Next greater element with a monotonic stack
- [ ] Implement an LRU cache from scratch (HashMap + doubly linked list)

### 1.3 Binary search
Topics: classic search, first and last occurrence, rotated arrays, search on the answer, 2D search.

- [ ] Write the boundary correctly for "first true" and "last true"
- [ ] Search on the answer (minimum capacity, minimum speed)

**Exit check for Phase 1:** solve 40 easy and medium problems, with each one logged in the pattern notebook.

---

## Phase 2: Advanced DSA

### 2.1 Trees
Topics: traversals (recursive, iterative, level order), height, diameter, LCA, BST operations and validation, trie, segment tree intro.

- [ ] Write all three DFS traversals and level order
- [ ] Compute height and diameter with one recursion
- [ ] Validate a BST with ranges, not only child comparisons
- [ ] Build a trie and a segment tree

### 2.2 Graphs
Topics: adjacency list and matrix, BFS, DFS, grid problems, cycle detection, topological sort (Kahn and DFS), union-find (path compression and rank), Dijkstra, Bellman-Ford, MST (Kruskal and Prim).

- [ ] BFS shortest path in an unweighted graph
- [ ] Cycle detection in a directed graph with three colours
- [ ] Topological sort with Kahn's algorithm
- [ ] Union-find and Kruskal
- [ ] Dijkstra with a priority queue and stale-entry skipping

### 2.3 Heaps and intervals
Topics: top K, kth largest, merge K sorted lists, median from a stream (two heaps), merge intervals, meeting rooms, sweep line, task scheduler.

- [ ] Kth largest with a min-heap of size K
- [ ] Median from a stream with two heaps
- [ ] Merge intervals and meeting rooms II

**Exit check for Phase 2:** solve 30 medium and hard problems across trees, graphs, and heaps.

---

## Phase 3: Algorithm paradigms

### 3.1 Dynamic programming
Topics: memoization, tabulation, space optimisation, 1D (stairs, house robber, coin change), 2D (grids), knapsack variants, LIS, LCS, edit distance, partition, DP on strings.

- [ ] Write the state definition in one sentence before any code
- [ ] Convert a memoised solution to tabulation
- [ ] Optimise space for a 2D DP to a single row
- [ ] Solve an interval DP problem

### 3.2 Backtracking
Topics: subsets, permutations, combinations, N-Queens, word search, pruning, duplicate control.

- [ ] Use the choose, explore, undo template
- [ ] Skip duplicates with sort-and-skip
- [ ] Prune a search and explain the bound

### 3.3 Complexity and habits
- [ ] State time and space complexity for every solution you write
- [ ] Explain amortized cost (dynamic arrays, union-find)
- [ ] Review failed problems on days 3, 7, and 21

---

## Phase 4: Design patterns

Implement each pattern with a small runnable demo and write down **the force it resolves**.

| Family | Patterns | Force to remember |
|---|---|---|
| Creational | Singleton (pitfalls), Factory Method, Abstract Factory, Builder, Prototype | Creation varies, or must be controlled |
| Structural | Adapter, Decorator, Facade, Proxy, Composite | Interfaces do not fit, or behaviour must be layered |
| Behavioral | Strategy, Observer, State, Command, Template Method, Chain of Responsibility, Iterator | Behaviour varies by rule, state, or request |
| DI | Dependency injection by hand | Dependencies must be replaceable and testable |

- [ ] All 18 patterns implemented with a demo
- [ ] Can explain when **not** to use each pattern
- [ ] Refactor one `if/else` chain into Strategy and one into State

---

## Phase 5: Low-Level Design

Follow the five-step method for every problem:

1. **Requirements:** clarify scope, list assumptions, separate must-have from nice-to-have.
2. **Entities and relationships:** find the nouns; decide composition vs association.
3. **Class diagram:** draw the classes, fields, methods, and relationships.
4. **Code:** happy path first, then the rules and errors.
5. **Tests and extensions:** expected outputs, plus two extension points you can add without changing old code.

### Core problems
- [ ] 01 Parking lot (pricing strategy, spot allocation)
- [ ] 02 LRU cache (generic, eviction callback)
- [ ] 03 Rate limiter (token bucket and sliding window)
- [ ] 04 Elevator (SCAN scheduling)
- [ ] 05 Library system (loans, fines, waitlist)
- [ ] 06 Notification service (channels, fallback)
- [ ] 07 Tic-tac-toe (N by N, win and draw detection)
- [ ] 08 Vending machine (State pattern)
- [ ] 09 BookMyShow (seat holds, all-or-nothing booking)
- [ ] 10 Splitwise (shared expenses, debt settlement)

### Extra problems
- [ ] Snake and ladder
- [ ] Hotel booking
- [ ] Shopping cart and checkout
- [ ] Logger framework
- [ ] Cab booking
- [ ] Pub-sub message broker
- [ ] Stock exchange order matching

**Exit check for Phase 5:** complete at least 8 projects, each with a class diagram and an extension note.

---

## Phase 6: Revision and mock interviews

- **Spaced review:** redo every failed problem 3, 7, and 21 days later without looking at the solution.
- **Weekly:** read `mistakes-log.md` and extract one rule per mistake.
- **Timed practice:** easy 20 minutes, medium 35 minutes, hard 60 minutes.
- **Mock interviews:** two per week. Explain your approach out loud before coding, and state complexity at the end.
- **LLD mocks:** 35 minutes, five steps, one whiteboard-style diagram.

---

## Practice question bank

| Level | Topic | Count | Notes |
|---|---|---|---|
| Easy | All topics | 10 | Warm-up, 20 minutes each |
| Medium | All topics | 12 | Core interview level |
| Hard | All topics | 8 | Combine two patterns |
| Deep dive | Arrays, lists, search, trees, graphs, heaps, DP, backtracking | 60+ | Hints only; attempt before you check |

Solutions are intentionally not published. Use hints first, then the pattern notebook, and only then compare your approach with the reference.

---

## Tracking progress

Copy this checklist into the top of your README when you start, and tick items as you go.

```markdown
Easy __/10   Medium __/12   Hard __/8   Deep-dive __/60
Patterns __/18   LLD __/10   Mock interviews __
```

---

## Companion resources

- **Volume 2: Object-Oriented Design in Java.** Four pillars, composition, SOLID, immutability, Builder, nested classes, initialization order.
- **Volume 3: DSA, Design Patterns and LLD in Java.** The full notes behind this repository, with diagrams and verified programs.

Other recommended reading (optional):

- *Effective Java* by Joshua Bloch (immutability, builders, interfaces).
- *Introduction to Algorithms* (CLRS) for proofs and formal analysis.
- *Head First Design Patterns* for a gentler introduction to patterns.

---

## Mistakes log template

```markdown
| Date | Problem | What I did | Why it was wrong | Rule to remember |
|------|---------|------------|------------------|------------------|
| 2026-10-13 | M03 Min Window | Shrank before checking validity | Window could become empty | Check validity before moving left |
```

---

## Contributing

This is a personal learning repository, but suggestions are welcome. Open an issue for:

- a clearer explanation of a topic,
- a bug in a `Main.java` demo,
- a missing practice question.

Please do not open pull requests with full solutions to the practice problems. Hints and explanations are welcome.

---

## License

Personal learning material. Add a license of your choice before making the repository public.
