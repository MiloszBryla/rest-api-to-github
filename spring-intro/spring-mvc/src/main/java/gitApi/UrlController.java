package gitApi;


import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.reactive.function.client.WebClient;

@Controller
public class UrlController {
    @GetMapping("/repositories/{login}/{name}")
    @ResponseBody
    public String getUri(@PathVariable("login") String login, @PathVariable("name") String name) {
        return getRepoInfo("https://api.github.com/repos/" + login + "/" + name);
    }

    public String getRepoInfo(String address) {
        WebClient client = WebClient.create();
        WebClient.RequestHeadersUriSpec<?> request = client.get();
        WebClient.RequestBodySpec uri = client
                .method(HttpMethod.GET)
                .uri(address);
        return request
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

}
