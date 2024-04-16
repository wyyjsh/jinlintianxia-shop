package cn.lili.modules.system.entity.dto.payment;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 支付宝支付设置
 *
 * @author Chopper
 * @since 2020-12-02 10:09
 */
@Data
@Accessors(chain = true)
public class AlipayPaymentSetting {

    /**
     * 应用id
     */
    private String appId = "9021000134698042";

    /**
     * 私钥
     */
    private String privateKey = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCulXxfmkdTzQelTj9vQNaImszWx/8BttbAFTKEJwXYpxpg7oBHkPwe/k7bO4EcRG9AZ/hxGXM3KLYCqIrolOJ6LSWWVu5LaidGBowsaREbTqATZqSoe4qdnAl7FXyDiCMqIDRAmdPvgehPIvJIsaYA3Q1DnbKD3NDopxkFNS3cHqinUTdjP+/EnX673zLL8RRnet3jfdh2FEMsMKE8LyVtZFwMQzxxHehTOFEoBxISb7p39KEZlgzdgipSKbIDGyQ1677W+PFppSM4FDNna2/sPlPSJx78aa+2tuTXgO2p4/moC0NIWCn813iF73vY/2/miMbPF4Mm0S9tLTd6YFR7AgMBAAECggEBAItTxVROvYnFYMqt7bYN2qheUgc+yOZHUo8s24nX0rSad1TQQhPbQzpA3hHcJSe3/ck6sG0iUG6+0LLCa0k+OJgkm5Clg7sv1nPuGcP/faV7VAjnq5TCM1ehBXfzJ9GYveeKl+jOWvMTi6BMVWtqSv75avKBUcwmV5q0cCVV0WmOxHmvD7S6pPBvLZ6gIzyAvIl7XsDmIQmhjz4BsnrbQNJvi53RIDkWsp6SpnwLXvPNgCgCU2HAps53stnfNlUeoTRwgSABtVqj+7WbO8S/hG/ZKk6bYfZbpk1ycO4EyZBbXsnKfAmquQ4WivNIQcOcL/fzLiYUjFU6wEtAmGYFHrECgYEA3ASvJ9uLny5ZjJA9HphybN6lP2QVFFdp2vs80BasWNsQ4zP2OsmXsHKta6liRRvOxYXVDRNENY1TQ+4moAipqtSh7ZwDLanaCdzl6X2Mts68Y7pWHD2RAtbHtUzdGPDm3NbfYmfRwQDKKDx+yx4L9KKdz6US4evKTrFH8xc4Ih0CgYEAyyKj5O2W9VNp6Jt1HglIjb0XFr0Ezs+VsscsproOGjjKlAXs04425aGITBBHpotf/EVFdLzZz8yh0eTbw+Mt3h3SaNgxEkR4ktLmO5UFFOIeKiAH/BIJquHUbgE9HSXmYE8BsnmbPPpKugMeJFAt73uzkT3Wh6v69PLoNyYxDXcCgYBZw4d6qXXTYeOjF434F5ZHmKausDRxciB7+RichUOXlPjU2XRSE8FRedgLHrY7H9dCexGrHfssJhaclmMn06D1U38lJAuf67ZLY9ZhZpmsU7hEr9dF+lBZaitcapmh/VcTLo9A5L6NEbdopxXL5NxX2Kit+Nk1Vy/Y3zdNlGGQeQKBgCkn5YjWUkV2FvkXtgzV2KtO6kSjGzxDdpL4I6XMAFtzsid3Y9og8CJqLdErYzjs+A+GgWH7eS3OyeJauePgPUTJSf4P/zEySjOFIzxjHtpyTaY/Qx7hELBcfMuk2Jr1OM2+dBuS487g7w7s3siAri3dJC6DFtn6EChcpou14y5VAoGAENkU9g30yKnxxWVXUndAvqw4b8EQefdmJ3wk3qrXRuSrJkfDAP7xzFb8b2u+gswGoisrtDmFiMQVAuAXffFKFJonA3oYb0hjSzb39zGxwbgOOjk61LsCncRjaQAU4yznReJBeV7sbI7MmEZjAWOzxsLNfoP/GpvnaF1Zf0F8mU8=";

    /**
     * 应用证书
     */
    private String certPath="D:/alipay/crt/appPublicCert.crt";

    /**
     * 支付宝公钥
     */
    private String alipayPublicCertPath = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgVszM+G+3hXkNs3m14Y4wWgdwQAN4UMbZ5LcDfTlY85oY2puR2ejKeJZFY9Pa/zj3O5ZVfhwU6f9id47+6V4n76Qi/vC51KDAAPI56oxn68ykTTIm+PHV11pENZbnJSo+iXVKxXpgL62w4Vj5vQmwDOjVH95jXeMJ3/Ba98PkCxyXYuzWUjhgD9xdUzxEqtAC3RTIeflbC1vaD2ItRdOjQpWUahszHQMD01yNFxumrIxdlg4pBvZg8zsDK3kIquodnut6g5d02s6GPQKkuQj2wVIz5t5nUKjYeX+fszXxiQDRWJyccDP1dNgVeHeHuHQdkh+D7xk5SBp37fKaJ8hSQIDAQAB";

    /**
     * 支付宝根证书
     */
    private String rootCertPath="D:/alipay/crt/alipayRootCert.crt";

}
