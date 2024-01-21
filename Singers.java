package MianoExer03;

public class Singers {
		   public int singersID;
		   public String singersName;
		   public String singersAddress;
		   public String dateOfBirth;
		   public int numberOfAlbum;
		   Singers()
		   {
		       
		       singersID = 200;
		       singersName = "Edge Miano";
		       singersAddress = "Green Hills";
		       dateOfBirth = "8/18/01";
		       numberOfAlbum = 100;
		   }
		   Singers(int num1, String str1, String str2, String str3, int num2)
		   {
		       
		       singersID = num1;
		       singersName = str1;
		       singersAddress = str2;
		       dateOfBirth = str3;
		       numberOfAlbum = num2;
		   }
		   
		   public int getSingersID() {
		       return singersID;
		   }
		   public void setSingersID(int singersID) {
		       this.singersID = singersID;
		   }
		   public String getSingersName() {
		       return singersName;
		   }
		   public void setSingersName(String singersName) {
		       this.singersName = singersName;
		   }
		   public String getSingersAddress() {
		       return singersAddress;
		   }
		   public void setSingersAddress(String singersAddress) {
		       this.singersAddress = singersAddress;
		   }
		   public String getDateOfBirth() {
		       return dateOfBirth;
		   }
		   public void setDateOfBirth(String dateOfBirth) {
		       this.dateOfBirth = dateOfBirth;
		   }
		   public int getNumberOfAlbum() {
		       return numberOfAlbum;
		   }
		   public void setNumberOfAlbum(int numberOfAlbum) {
		       this.numberOfAlbum = numberOfAlbum;
		   }

		   
	
	

	}


