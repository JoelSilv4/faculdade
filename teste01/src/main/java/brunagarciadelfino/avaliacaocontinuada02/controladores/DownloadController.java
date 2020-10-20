package brunagarciadelfino.avaliacaocontinuada02.controladores;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/download")
public class DownloadController {

    @GetMapping("/1")
    public ResponseEntity get1() {
        return ResponseEntity.ok(1);
    }

    @GetMapping(value = "/pdf-jogadores", produces={"application/pdf"})
    @ResponseBody
    public ResponseEntity getPdf() {
        return ResponseEntity.ok("não foi possivel encontrar arquivo");
    }

}
