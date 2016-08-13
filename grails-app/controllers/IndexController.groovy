class IndexController {

    def index() {
        Map map = new HashMap();
        map.put("date", new Date());
        return map;
    }
}
