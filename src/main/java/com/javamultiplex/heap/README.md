# Array representation of complete binary tree.

- Array starts with index 0.
  - left child = 2*i+1
  - right child = 2*i+2
  - parent = floor((i-1)/2)

- Array starts with index 1.
    - left child = 2*i
    - right child = 2*i+1
    - parent = floor(i/2)
  
# Heap

- Max Heap = parent(i) >= node(i)
- Min Heap = parent(i) <= node(i)