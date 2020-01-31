package builder.builder2;

public class TextBuilder implements Builder {
    private StringBuffer stringBuffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        stringBuffer.append("==============================\n");
        stringBuffer.append("『").append(title).append("』\n");
        stringBuffer.append("\n");
    }

    @Override
    public void makeString(String string) {
        stringBuffer.append("■").append(string).append("\n");
        stringBuffer.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (String item : items) {
            stringBuffer.append("　・").append(item).append("\n");
        }
        stringBuffer.append("\n");
    }

    @Override
    public void close() {
        stringBuffer.append("==============================\n");
    }

    String getResult() {
        return stringBuffer.toString();
    }
}
