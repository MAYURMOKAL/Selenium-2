package LearnTestng;

import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test(dependsOnMethods = "signUp")
	public void login() {
		System.out.println("Login");
	}
	@Test
	public void signUp() {
		System.out.println("SignUp");
	}
	@Test(dependsOnMethods = {"signUp","login","uploadProfilePic"})
	public void sendFrindRequest() {
		System.out.println("Send Friend Request");
	}
	@Test(dependsOnMethods = {"signUp","login","sendFrindRequest","uploadProfilePic"} )
	public void acceptFriendRequest() {
		System.out.println("Accept Friend Request");
	}
	@Test(dependsOnMethods = {"signUp","login","sendFrindRequest","uploadProfilePic"})
	public void deleteFriendRequest() {
		System.out.println("Delete Friend Request");
	}
	@Test(dependsOnMethods = {"signUp","login","sendFrindRequest","uploadProfilePic","acceptFriendRequest"})
	public void likePhoto() {
		int a[] = {1,2,3};
		System.out.println(a[4]);
		System.out.println("Like A Photo");
	}
	@Test(dependsOnMethods = {"signUp","login","sendFrindRequest","uploadProfilePic","acceptFriendRequest"})
	public void CommentPost() {
		System.out.println("Comment Post");
	}
	@Test(dependsOnMethods = {"signUp","login"})
	public void uploadProfilePic() {
		System.out.println("Upload Profile Pic");
	}
}
