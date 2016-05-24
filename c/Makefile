CC=gcc

linked-list: linked_list.c
	$(CC) -o linked_list.o linked_list.c

test-linked-list: test_linked_list.c linked_list.o
	$(CC) -o test_linked_list test_linked_list.c linked_list.o

test-stack: test_stack.c linked_list.o
	$(CC) -o test_stack test_stack.c linked_list.o

test: 
	$(MAKE) linked-list
	$(MAKE) test-linked-list 
	$(MAKE) test-stack
	./test_linked_list
	./test_stack
