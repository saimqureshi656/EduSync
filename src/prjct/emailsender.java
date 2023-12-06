
package prjct;

import com.email.durgesh.Email;

public class emailsender {
public static void emailll(String emaill,String subject,String content ,String type){
try{
Email email=new Email("saimqureshi656@gmail.com","xbwpqqomqrolphin");
email.setFrom("saimqureshi656@gmail.com","EduSync");
email.setSubject(subject);
email.setContent(content,type);
email.addRecipient(emaill);
email.send();
}catch(Exception e){


}

}    
}
