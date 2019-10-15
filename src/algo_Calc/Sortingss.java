package algo_Calc;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;

//import java.awt.Desktop;
//import java.io.File;
//import java.io.IOException;

class quiks
{
	 void quickSort(int[] num, int start, int end)
	 {
	    int partition = partition(num, start, end);
        if(partition-1>start)
        {
        	quickSort(num, start, partition - 1);
        }
    	if(partition+1<end) 
    	{
    		quickSort(num, partition + 1, end);
    	}
	 }

	     int partition(int[] num, int start, int end){
	         int pivot = num[end];

	         for(int i=start; i<end; i++){
	            if(num[i]<pivot){
	            int temp= num[start];
	            num[start]=num[i];
	            num[i]=temp;
	            start++;
	        }
	        }

	        int temp = num[start];
	        num[start] = pivot;
	        num[end] = temp;
	        return start;

	        }
}	        




class merg{
	

    void merge(int num[], int l, int m, int r)
    {
        int i, j, k;
        int n1 = m - l + 1;
        int n2 =  r - m;
        int[] L = new int[n1];  
        int[] R = new int[n2];  
        //int L[n1], R[n2];

        for (i = 0; i < n1; i++)
            L[i] = num[l + i];
        for (j = 0; j < n2; j++)
            R[j] = num[m + 1+ j];

        i = 0; // Initial index of first subarray
        j = 0; // Initial index of second subarray
        k = l; // Initial index of merged subarray
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                num[k] = L[i];
                i++;
            }
            else
            {
                num[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1)
        {
            num[k] = L[i];
            i++;
            k++;
        }

        while (j < n2)
        {
            num[k] = R[j];
            j++;
            k++;
        }
    }

    void mergeSort(int num[], int l, int r)
    {
        if (l < r)
        {
                int m = l+(r-l)/2;

            mergeSort(num, l, m);
            mergeSort(num, m+1, r);
            merge(num, l, m, r);
        }
    }
	
}


class heaps{
	void heapify(int num[], int size, int i)
    {
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if (left < size && num[left] >num[largest])
            largest = left;

        if (right < size && num[right] > num[largest])
            largest = right;

        if (largest != i)
        {
        	int temp;
            temp = num[i];
            num[i]= num[largest];
            num[largest] = temp;
            heapify(num, size, largest);
        }
    }
 
	
	void heapSort(int num[], int size)
	    {
	        int i;
	        for (i = size / 2 - 1; i >= 0; i--)
	            heapify(num, size, i);
	        for (i=size-1; i>=0; i--)
	        {
	        	int temp;
	            temp = num[0];
	            num[0]= num[i];
	            num[i] = temp;
	            heapify(num, i, 0);
	        }
	     }
	       
}


public class Sortingss {

	private JFrame frame;
	private JTextField textField;
	int key;
	String tname = new String();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws Exception{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sortingss window = new Sortingss();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Sortingss() {
		initialize();
	}
	public int vis(int k,String str){
		key=k;
		tname="Hello";
		tname="pop";
		tname=str;
		frame.setVisible(true);
		return 0;
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
 
   
        private void initialize() {
		
        frame = new JFrame();
		frame.setBounds(100, 100, 514, 329);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Arial", Font.BOLD, 26));
		textArea_1.setBackground(Color.DARK_GRAY);
		textArea_1.setForeground(Color.WHITE);
		textArea_1.setBounds(102, 0, 304, 41);
		frame.getContentPane().add(textArea_1);
		
		
		textField = new JTextField();
		textField.setBounds(102, 102, 304, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterInput = new JLabel("Enter Input");
		lblEnterInput.setBounds(30, 105, 85, 16);
		frame.getContentPane().add(lblEnterInput);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		textArea.setBounds(102, 175, 304, 56);
		frame.getContentPane().add(textArea);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				
				String fin = new String();
				String str=new String();
				str = textField.getText();
				
				String [] tok = str.split(" ");
				int [] num = new int[tok.length];
				
				for(int i=0;i<tok.length;i++){
					num[i]=Integer.parseInt(tok[i]);
				}
				if(key==1)
				{
					int j;
			        boolean flag = true;   // set flag to true to begin first pass
			        int temp;   //holding variable

			        while ( flag )
			        {
			            flag= false;    //set flag to false awaiting a possible swap
			            for( j=0;  j < num.length -1;  j++ )
			            {
			                if ( num[ j ] > num[j+1] )   // change to > for ascending sort
			                {
			                    temp = num[ j ];                //swap elements
			                    num[ j ] = num[ j+1 ];
			                    num[ j+1 ] = temp;
			                    flag = true;              //shows a swap occurred
			                }
			            }
			        }
			        fin = "Bubble Sort =";
				}
				if(key==2){
			        int n = num.length;

			        // One by one move boundary of unsorted subarray
			        for (int i = 0; i < n-1; i++)
			        {
			            // Find the minimum element in unsorted array
			            int min_idx = i;
			            for (int j = i+1; j < n; j++)
			                if (num[j] < num[min_idx])
			                    min_idx = j;

			            // Swap the found minimum element with the first
			            // element
			            int temp = num[min_idx];
			            num[min_idx] = num[i];
			            num[i] = temp;
			        }
			        tname="SELECTION SORT";
			        fin = "Selection Sort =";
				}
				if(key==3){
				
					
					quiks obj2 =new quiks();
					int size=num.length;
					obj2.quickSort(num,0,size-1);
					fin="Quick Sort =";
					tname="QUICK SORT";
				}
				
				if(key==4){
					int i, ke, j;
			        for (i = 1; i < tok.length; i++)
			        {
			            ke = num[i];
			            j = i - 1;

			        /* Move elements of arr[0..i-1], that are
			        greater than key, to one position ahead
			        of their current position */
			            while (j >= 0 && num[j] > ke)
			            {
			                num[j + 1] = num[j];
			                j = j - 1;
			            }
			            num[j + 1] = ke;
			        }
			        tname="INSERTION SORT";
			        fin = "Insertion Sort =";
				}
				if(key==5){
					merg obj3=new merg();
					int size =num.length-1;
					obj3.mergeSort(num, 0, size);
					fin ="Merge Sort =";
					tname="MERGE SORT";
				}
				
				if(key==6){
					heaps obj4=new heaps();
					int size;
					size=tok.length;
					obj4.heapSort(num,size);
					fin ="Heap Sort =";
					tname="HEAP SORT";
				}
				
				String str1[] =new String[tok.length];
				for(int i=0;i<tok.length;i++){
					str1[i]=Integer.toString(num[i]);
					fin=fin+" "+str1[i];
				}
				textArea.setText(fin);
				textArea_1.setText(tname);
			}
		});
		btnSubmit.setBounds(210, 137, 97, 25);
		frame.getContentPane().add(btnSubmit);
		
		JLabel lblIntegerMustBe = new JLabel("Integer must be space separated in your input");
		lblIntegerMustBe.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblIntegerMustBe.setBounds(29, 48, 408, 41);
		frame.getContentPane().add(lblIntegerMustBe);
		
		JLabel lblYourOutput = new JLabel("Your Output");
		lblYourOutput.setBounds(30, 178, 112, 16);
		frame.getContentPane().add(lblYourOutput);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnExit.setBounds(210, 244, 97, 25);
		frame.getContentPane().add(btnExit);
		
		JButton btnOpenCode = new JButton("Open Code");
		btnOpenCode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
			if(key==1)
			{
				try{
				ProcessBuilder pb= new ProcessBuilder("Notepad.exe","bubble.txt");	
				pb.start();
				}catch(Exception ew){
					System.out.println(ew.toString());
				}
			}
			//C:\\Users\\HARSH\\workspace\\Selection.txt
			if(key==2){
				try{
					ProcessBuilder pb= new ProcessBuilder("Notepad.exe","selection.txt");	
					pb.start();
					}catch(Exception ew){
						System.out.println(ew.toString());
					}
			}
			if(key==3){
			
				try{
					ProcessBuilder pb= new ProcessBuilder("Notepad.exe","quicksort.txt");	
					pb.start();
					}catch(Exception ew){
						System.out.println(ew.toString());
				}
			}
			
			if(key==4){
				
				try{
					ProcessBuilder pb= new ProcessBuilder("Notepad.exe","insertion.txt");	
					pb.start();
					}catch(Exception ew){
						System.out.println(ew.toString());
				}
			}
			if(key==5){
				
				try{
					ProcessBuilder pb= new ProcessBuilder("Notepad.exe","merge.txt");	
					pb.start();
					}catch(Exception ew){
						System.out.println(ew.toString());
				}				
			}
			
			if(key==6){
				try{
					ProcessBuilder pb= new ProcessBuilder("Notepad.exe","maxheap.txt");	
					pb.start();
					}catch(Exception ew){
						System.out.println(ew.toString());
				}
			}
			}
		});
		btnOpenCode.setBounds(372, 244, 97, 25);
		frame.getContentPane().add(btnOpenCode);
		
		
	}
}
