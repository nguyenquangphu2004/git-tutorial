//Toi vua moi tao repository


public enum Study {
       F("Trượt Môn"),
       D("Yếu"),
       C("Trung Bình"),
       B("Khá"),
       A("Giỏi"),
       A_Plus("Xuất Sắc");
       Study(String value) {
              this.value = value;
              
       }
       private String value;
       public String getValue() {
              return value;
       }

}


///i am doing change code at this file