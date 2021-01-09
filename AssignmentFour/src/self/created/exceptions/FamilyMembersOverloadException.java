package self.created.exceptions;

public class FamilyMembersOverloadException extends Exception{

    public FamilyMembersOverloadException() {
    this("family members cant be more than 15");
    }

    public FamilyMembersOverloadException(String message) {
        super(message);
    }
}
