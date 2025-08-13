package boundedContext.member;

import boundedContext.global.base.Rq;

public class MemberController {
    public void showJoin(Rq rq) {
        rq.appendBody("회원가입");
    }
}
