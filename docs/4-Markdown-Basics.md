# Markdown Basics Guide

Markdown is a lightweight markup language that you can use to add formatting to plain text documents. Here's how to use it:

## Basic Syntax

### 1. Headers
```markdown
# Heading 1
## Heading 2
### Heading 3
```

### 2. Text Styling
```markdown
**Bold text**
*Italic text*
~~Strikethrough~~
```

### 3. Lists
```markdown
- Bullet point 1
- Bullet point 2
  - Nested bullet point

1. Numbered item 1
2. Numbered item 2
```

### 4. Code Blocks
````markdown
```java
public class Example {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```
````

### 5. Links and Images
```markdown
[Link text](https://example.com)
![Image alt text](image-url.jpg)
```

## How to Edit Markdown Files

1. You can edit .md files in VS Code directly
2. VS Code provides a preview button (split screen icon) in the top right corner
3. Changes are saved just like any other file (Ctrl + S)

## How to Push Markdown Changes to GitHub

1. After editing your .md file, stage the changes:
   ```bash
   git add docs/4-Markdown-Basics.md
   ```

2. Commit the changes:
   ```bash
   git commit -m "Add Markdown basics guide"
   ```

3. Push to GitHub:
   ```bash
   git push
   ```

## Tips
- Use the VS Code preview feature to see how your markdown will look
- Commit markdown files just like you would commit code files
- Keep your documentation organized in the docs folder