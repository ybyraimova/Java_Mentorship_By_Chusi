package classWork.lalafo;

import java.util.ArrayList;
import java.util.List;

public class MainPage {
    List <Ad> adList;
    public void addAd(List <Ad> ad){
        adList.addAll(ad);
    }

    public MainPage() {
        this.adList = new ArrayList<>();
    }

    public  void showAd(){
        System.out.println("These are books in main page");
        for(Ad i : adList){
            System.out.println( i.name + " " + i.category);

                if(!i.newCommentArrayList.isEmpty()){
                    System.out.println("These are the comments: ");
                }
            for(NewComment j: i.newCommentArrayList){
                System.out.println(j.userName+  ": " + j.message + " " + j.date);

            }
        }
        System.out.println();
    }
}
