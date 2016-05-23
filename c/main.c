#include "linked_list.h"

int main() {
    node_t * head = create_node(1);
    add_node(head, 2);
    add_node(head, 3);
    add_node(head, 4);
    add_node(head, 5);


    print_list(head);

    return 0;
}
