class linkedListUsingArray{
    char data[];
    int next;

    public linkedListUsingArray(int MAX){
        data = new char[MAX];
    }

    public void insertFirst(char d){
        if(data[next]==0){
        data[next] = d;
        next++;
        }
        else{
            System.out.println("list is full");
        }
    }




    public void insertAfter (char after ,char value){
        next=0;
        while(data[next] !=after){
            next++;
        }
        char temp = data[next+1];
        data[next+1] = value;

    }

    public void printList(){
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]);
        }
    }


    public static void main(String args[]) {
	        linkedListUsingArray list = new linkedListUsingArray(9);
	        list.insertFirst('T');
	        list.insertFirst('H');
	        list.insertFirst('L');
	        list.insertAfter('T', 'z');
	        list.printList();
    }
}
