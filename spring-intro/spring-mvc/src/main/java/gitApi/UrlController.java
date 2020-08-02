package gitApi;


import com.fasterxml.jackson.databind.JsonNode;
import gitApi.Model.ResultSet;
import org.json.simple.JSONObject;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.reactive.function.client.WebClient;
import javax.xml.transform.Result;

@Controller
public class UrlController {

    private WebClient.Builder clientBuilder = WebClient.builder();

    @GetMapping("/repositories/{login}/{name}")
    @ResponseBody
    public ResultSet getUri(@PathVariable("login") String login, @PathVariable("name") String name) {
        return getRepoInfo("https://api.github.com/repos/" + login + "/" + name);
    }

    public ResultSet getRepoInfo(String address) {

        return clientBuilder.build()
                .get()
                .uri(address)
                .retrieve()
                .bodyToMono(ResultSet.class)
                .block();

    }



}
