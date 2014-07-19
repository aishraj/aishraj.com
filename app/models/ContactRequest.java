package models;

import play.data.validation.Constraints;

/**
 * Created by ge3k on 18/7/14.
 */
public class ContactRequest {
    @Constraints.Required
    public String name;

    @Constraints.Required
    @Constraints.Email
    public String email;

    @Constraints.MaxLength(500)
    @Constraints.Required
    public String message;
}
