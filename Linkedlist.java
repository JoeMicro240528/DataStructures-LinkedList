public class Linkedlist{

       private  Node first;
       private Node last;
       private int length;

      public Linkedlist(){
          first = last = null;
          length = 0;
      }

          boolean isEmpty(){
			  return (length==0);
		  }

       // insert from first
		 private void insertFirst(int element){
			  Node newNode = new Node();
			  newNode.item = element;
			  if(isEmpty()){
                    first = last = newNode;
                    newNode.next=null;
			  }else{

				  newNode.next = first;
				  first = newNode;
			  }
                  length=length+1;

		  }

       // insert from last
		private void insertLast(int element){
		  		  Node newNode = new Node();
		  		  newNode.item = element;
		  		  if(isEmpty()){
		              first = last = newNode;
		                newNode.next=null;
		  			}else{

						   last.next = newNode;
				           newNode.next = null;
				           last=newNode;
					}

					 length=length+1;
			  }
       // insert in at position
      private void insertAtPos(int pos , int element){

		 if(pos<0||pos>length){
               System.out.println("The position out of Range!!!");
		  }else{
			   Node newNode = new Node();
			   newNode.item=element;
			  if(pos==0){
			 	insertFirst(element);
			  }else if(pos==length){
				 insertLast(element);
			  }else{
				 Node curr = first;
				 for(int i=1;i<pos;i++){
					  curr = curr.next;
					  newNode.next = curr.next;
					  curr.next = newNode;
					  length=length+1;
				 }
			    }
			 }
		 }

          // Remove from first
          private void removeFirst(){
			  if(isEmpty()){
				  System.out.println("The List is Empty Can't Remove");
			  }else if(length==1){
				  	first=last=null;
				  	length=length-1;
			  }else{
				  Node Temp = first;
				  first=first.next;
				  Temp=null;
				  length=length-1;
			  }

		  }

		  // Remove from Last
		  private void removeLast(){
		  	  if(isEmpty()){
		  	  System.out.println("The List is Empty Can't Remove");
		      }else if(length==1){
		  	  	first=last=null;
		  	  	length=length-1;
			  }else{
				  Node prev = first;
				  Node curr = first.next;
				  while(curr!=last){
					 prev=curr;
					 curr=curr.next;
				    }
		     	   prev.next=null;
		     	   last=prev;
				   length=length-1;
	            }
	       }

	        // Remove from anyWhere
	 	     private void remove(int element){
	 		  	if(isEmpty()){
	 		    System.out.println("The List is Empty Can't Remove");
		      }

		       Node curr,prev;
		      if(first.item==element){
				  first=first.next;
				  length=length-1;
				  if(length==0)
				     last=null;
			  }else{
				  curr=first.next;
				  prev=first;
				  while(curr!=null){
					  if(curr.item==element)
					     break;
				        prev=curr;
				        curr=curr.next;
				  }
				   if(curr==null)
                      System.out.println("The Item Can't not Found!!");
                   else{
						prev.next=curr.next;
						if(last==curr)
						  last=prev;
						  length=length-1;
			     }
			  }
		 }

		 //Search for Eelement
        private int search(int element){
			 Node curr = first;
			 int pos=0;
			  while(curr!=null){
				if(curr.item==element)
				       return pos;
				       curr=curr.next;
				       pos=pos+1;
		        }
		           return -1;
		}

	    // display Item inside the list
		private void print(){
			 Node curr = first;
			 while(curr!=null){
				 System.out.print(curr.item+" ");
				 curr=curr.next;
			 }
			 System.out.println(" ");
			 System.out.println(" ");
		 }

         public static void main(String[] args){
               Linkedlist L =  new Linkedlist();

               System.out.println(L.isEmpty()+"\n");

               L.insertFirst(10);
               L.insertLast(30);
               L.insertLast(40);
               L.print();
               System.out.println(L.search(40)+"\n");

               L.insertFirst(5);
               L.insertAtPos(2,20);
               L.print();
               System.out.println(L.search(5)+"\n");

               L.removeFirst();
               L.removeLast();
               L.print();

               L.remove(20);
               L.print();

	}

}