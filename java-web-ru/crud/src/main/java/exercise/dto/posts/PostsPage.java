package exercise.dto.posts;

import java.util.List;
import exercise.model.Post;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


// BEGIN
@AllArgsConstructor
@Getter
public class PostsPage {
    private List<PostPage> posts;
    private int page;
}
// END


