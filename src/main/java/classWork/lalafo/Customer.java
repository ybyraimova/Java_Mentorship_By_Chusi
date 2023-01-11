package classWork.lalafo;

public class Customer extends Account{
    public Customer(String username, String password, String location, String fullName, String phoneNumber) {
        super(username, password, location, fullName, phoneNumber);
    }

    @Override
    public void logIn() {
        System.out.println("You have logged in (customer)");


    }

    public Ad addNewComment(NewComment newComment, Ad ad){
        ad.newCommentArrayList.add(newComment);
        return ad;

    }



}
