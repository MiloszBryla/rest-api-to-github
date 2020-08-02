package gitApi;


import com.fasterxml.jackson.databind.JsonNode;
import org.json.simple.JSONObject;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.reactive.function.client.WebClient;

@Controller
public class UrlController {

    private WebClient.Builder clientBuilder = WebClient.builder();

    @GetMapping("/repositories/{login}/{name}")
    @ResponseBody
    public String getUri(@PathVariable("login") String login, @PathVariable("name") String name) {
        return getRepoInfo("https://api.github.com/repos/" + login + "/" + name);
    }

    public String getRepoInfo(String address) {

        String name = clientBuilder.build()
                .get()
                .uri(address)
                .retrieve()
                .bodyToMono(String.class)
                .block();

        return name;
    }

}
