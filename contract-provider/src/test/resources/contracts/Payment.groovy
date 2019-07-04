package contracts

import org.springframework.cloud.contract.spec.Contract
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType

Contract.make {
    description "扫码支付"

    request {
        method POST()
        url "/payment/codes"
    }

    response {
        status OK()
        headers { header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON) }
        body([
                "code"   : 100,
                "message": "success",
                "data"   : [
                        "resultCode": 100,
                        "resultMsg" : "success",
                        "payTransId": "4200000313201907049761660775",
                        "fmId"      : "7702285149085300932638824",
                        "payCode"   : "10215",
                        "userId"    : "o1cvUM2t4SgkdamVkn123um7e613qo-ssssRsssw"
                ]])
    }
}
