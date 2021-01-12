package com.test2.parray;

public class Hotel {
    private static int height = 3;
    private  static int width = 10;
    Room [][] rooms;// = new Room[height][width];
    public Hotel() {
        rooms = new Room[height][width];
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                //可以放到Room构造函数里
                rooms[i][j] = new Room();
                rooms[i][j].setId(i * width + j  + "");
                rooms[i][j].setLevel(height - i);
                rooms[i][j].setEmpty(0);
            }
        }
    }
    public void order(String id){
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                if(id.equals(rooms[i][j].getId())){
                    rooms[i][j].setEmpty(1);
                    return;
                }
            }
        }
    }
    public void cancel(String id){
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                if(id.equals(rooms[i][j].getId())){
                    rooms[i][j].setEmpty(0);
                    return;
                }
            }
        }
    }
    public void print(){
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                System.out.println(rooms[i][j].toString());
            }
        }
    }
}
