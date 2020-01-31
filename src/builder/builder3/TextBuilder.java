package builder.builder3;

public class TextBuilder extends Builder {
    private StringBuffer stringBuffer = new StringBuffer();

    @Override
    public void buildTitle(String title) {
        stringBuffer.append("==============================\n");
        stringBuffer.append("『").append(title).append("』\n");
        stringBuffer.append("\n");
    }

    @Override
    public void buildString(String string) {
        stringBuffer.append("■").append(string).append("\n");
        stringBuffer.append("\n");
    }

    @Override
    public void buildItems(String[] items) {
        for (String item : items) {
            stringBuffer.append("　・").append(item).append("\n");
        }
        stringBuffer.append("\n");
    }

    @Override
    public void buildDone() {
        stringBuffer.append("==============================\n");
    }

    String getResult() {
        return stringBuffer.toString();
    }
}
