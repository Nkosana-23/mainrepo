import os
import tkinter as tk
from tkinter import filedialog, messagebox
import pygame

# Supported music formats
MUSIC_EXTENSIONS = ['.mp3', '.wav', '.ogg']

class MusicPlayer:
    def __init__(self, root):
        self.root = root
        self.root.title("Simple Music Player")
        self.root.geometry("400x400")
        self.music_files = []

        # Initialize pygame mixer
        pygame.mixer.init()

        # UI Elements
        self.label = tk.Label(root, text="Select a folder to scan for music", font=("Arial", 12))
        self.label.pack(pady=10)

        self.scan_button = tk.Button(root, text="Browse Folder", command=self.browse_folder)
        self.scan_button.pack(pady=5)

        self.listbox = tk.Listbox(root, width=50)
        self.listbox.pack(pady=10)

        self.play_button = tk.Button(root, text="Play Selected", command=self.play_selected)
        self.play_button.pack(pady=5)

    def browse_folder(self):
        folder = filedialog.askdirectory()
        if folder:
            self.music_files = self.find_music_files(folder)
            self.listbox.delete(0, tk.END)
            for file in self.music_files:
                self.listbox.insert(tk.END, os.path.basename(file))

    def find_music_files(self, directory):
        music_files = []
        for root, _, files in os.walk(directory):
            for file in files:
                if any(file.lower().endswith(ext) for ext in MUSIC_EXTENSIONS):
                    music_files.append(os.path.join(root, file))
        return music_files

    def play_selected(self):
        selected = self.listbox.curselection()
        if not selected:
            messagebox.showwarning("No selection", "Please select a track to play.")
            return

        file_path = self.music_files[selected[0]]
        pygame.mixer.music.load(file_path)
        pygame.mixer.music.play()
        self.label.config(text=f"Now playing: {os.path.basename(file_path)}")

# Run the app
if __name__ == "__main__":
    root = tk.Tk()
    app = MusicPlayer(root)
    root.mainloop()
