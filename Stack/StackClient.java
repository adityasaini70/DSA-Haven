public class StackClient {
    public static void main(String[] args) {

        // Stack using arrays
        StackUsingArrays st = new StackUsingArrays(10);
        st.push(10);     
        st.push(9);
        st.push(8);
        st.push(7);
        st.display();
        st.pop();
        st.pop();
        st.display();
        st.push(6);
        st.push(5);
        st.display();

        //Stack using LL
        StackUsingLL st_ll = new StackUsingLL();
        st_ll.push(10);
        st_ll.push(9); 
        st_ll.push(8);
        st_ll.push(7);
        st_ll.display();
        st_ll.pop();
        st_ll.pop();
        st_ll.display();
        st_ll.push(6);
        st_ll.push(5);
        st_ll.display();



    }
}