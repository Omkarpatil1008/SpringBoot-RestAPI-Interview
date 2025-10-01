# GitHub Basics - A Beginner's Guide

## What is GitHub?
GitHub is like a cloud storage for your code with version control. Think of it as Google Drive for code, but with much more features!

## Basic Concepts

### 1. Repository (Repo)
- Like a project folder that GitHub tracks
- Your current repo: `SpringBoot-RestAPI-Interview`
- Contains all your project files and their history

### 2. Basic Git Commands We Used

```bash
# 1. Initialize a Git repository (We did this first)
git init
# This creates a hidden .git folder to track changes

# 2. Add files to staging area (Like preparing a package)
git add .
# The '.' means all files. You can also do specific files like:
git add filename.java

# 3. Commit changes (Like taking a snapshot)
git commit -m "Your message here"
# -m means message, explaining what you changed

# 4. Connect to GitHub repository (We did this once)
git remote add origin https://github.com/Omkarpatil1008/SpringBoot-RestAPI-Interview.git
# 'origin' is the default name for your GitHub repository

# 5. Push changes to GitHub (Upload your code)
git push -u origin master
# Uploads your commits to GitHub
```

## How to Do It Yourself

### First Time Setup
1. **Install Git**
   - Download from: https://git-scm.com/downloads
   - Install with default options

2. **Configure Git** (Do this once on your computer)
   ```bash
   git config --global user.name "Your Name"
   git config --global user.email "your.email@example.com"
   ```

3. **Create GitHub Account**
   - Go to https://github.com
   - Sign up with your email

### For Each New Project
1. **Create New Repository on GitHub**
   - Click '+' in top right corner
   - Choose 'New repository'
   - Name it (like we named 'SpringBoot-RestAPI-Interview')
   - Click 'Create repository'

2. **Connect Local Project to GitHub**
   ```bash
   # In your project folder:
   git init
   git add .
   git commit -m "First commit"
   git remote add origin YOUR_REPO_URL
   git push -u origin master
   ```

### Regular Workflow
1. **Make changes to your code**

2. **Check status** (what files changed)
   ```bash
   git status
   ```

3. **Add and commit changes**
   ```bash
   git add .
   git commit -m "Describe what you changed"
   ```

4. **Upload to GitHub**
   ```bash
   git push
   ```

## Visual Studio Code Integration
1. **Source Control Tab**
   - Click the branch icon in left sidebar
   - See all changed files
   - Type commit message
   - Click ✓ to commit
   - Click '...' for more options like push

2. **Common Actions in VS Code**
   - Stage changes: Click + next to file
   - Commit: Type message and click ✓
   - Push: Click sync button

## GitHub Desktop Alternative
If commands are confusing, you can use GitHub Desktop:
1. Download from: https://desktop.github.com/
2. It provides a visual interface for all these commands

## Why Use GitHub?
1. **Backup your code** in the cloud
2. **Track changes** over time
3. **Collaborate** with others
4. **Show your work** to potential employers
5. **Version control** - go back to previous versions

## Tips for Interviews
- Having projects on GitHub is great for your portfolio
- Shows you know modern development tools
- Demonstrates your coding practices
- Makes it easy to share code with interviewers

Remember: Don't worry if it seems complicated at first. Start with the basics:
1. `git add .`
2. `git commit -m "message"`
3. `git push`

These three commands will handle 90% of what you need!