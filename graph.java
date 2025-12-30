class Main{
    int v;
    int[][] adj;
    Main(int v){
        this.v=v;
        adj=new int[v][v];
    }
    void Addedge(int u,int v){
        adj[u][v]=1;
        adj[v][u]=1;
    }
    void display(){
        System.out.println("adj matrix");
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                System.out.print(adj[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Main m=new Main(3);
        m.Addedge(0,1);
        m.Addedge(1,2);
        m.Addedge(2,3);
        m.display();
    }
}