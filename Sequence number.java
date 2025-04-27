public class SequenceNumber{
    public static void main(String[] args) {
        int Matrix[][]= {{1,2,5,4,1},
                         {5,3,5,3,2},
                         {5,5,9,5,5},
                         {2,1,5,4,2},
                         {6,3,5,5,1}};
                         int N=5;
                         int up=0;
                         int down=0;
                         int right=0;
                         int left=0;
                         int c=N/2;
                         if(N < 3 && N% 2 == 0){
                             System.out.println(c);
                         }

                         for (int i=0;i<c;i++){
                                up+=Matrix[i][c];
                                System.out.println(up);
                         }

                         for(int i=c+1;i<N;i++){
                            down+=Matrix[i][c];
                            System.out.println(down);
                         }

                         for (int i=0;i<c;i++){
                             left+=Matrix[c][i];
                             System.out.println(left);
                         }

                         for(int i=c+1;i<N;i++){
                            right+=Matrix[c][i];
                            System.out.println(right);
                         }

                        System.out.println("");
                        int center=Matrix[c][c];
                        int a=left-right;int b=up-down;
                        if(a==0&&b==0)
                        {
                            System.out.print("Sequence");
                        }else{
                            System.out.println("Not");
                        }
    }
}
                       /* int min=0;
                        int max=0;
                        if(min==up&&min==down){
                            System.out.println(min);
                            if(min==right&&min==left){
                                System.out.print(min);
                            }
                        }

                        if(max==up&&max==down){
                            System.out.println("max");
                            if(max==right&&max==left){
                                System.out.println(max);
                            }
                        }*/
                            
                        
                             
                             
                         
    
    
