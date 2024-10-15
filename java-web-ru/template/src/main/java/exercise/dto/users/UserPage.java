package exercise.dto.users;

import exercise.model.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// BEGIN
@Getter
@Setter
@ToString
public final class UserPage {
    private User user;
}

// END