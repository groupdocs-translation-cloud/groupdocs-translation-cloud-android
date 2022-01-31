/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="FileInfo.java">
 *   Copyright (c) 2021 GroupDocs.Translation for Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */


package com.groupdocs.translation.cloud.android.api;

import java.util.ArrayList;

public class FileInfo {
    private String name;
    private String folder;
    private String storage;
    private String format;
    private String savePath;
    private String saveFile;
    private String pair;
    private Boolean masters;

    public Boolean getMasters() {
        return masters;
    }

    public void setMasters(Boolean masters) {
        this.masters = masters;
    }

    public ArrayList<Integer> getElements() {
        return elements;
    }

    public void setElements(ArrayList<Integer> elements) {
        this.elements = elements;
    }

    private ArrayList<Integer> elements;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    public String getSaveFile() {
        return saveFile;
    }

    public void setSaveFile(String saveFile) {
        this.saveFile = saveFile;
    }

    public String getPair() {
        return pair;
    }

    public void setPair(String pair) {
        this.pair = pair;
    }

    public FileInfo(String name, String folder, String pair, String format, String storage, String saveFile, String savePath) {
        this.name = name;
        this.folder = folder;
        this.storage = storage;
        this.format = format;
        this.savePath = savePath;
        this.saveFile = saveFile;
        this.pair = pair;
    }

    public FileInfo(String name, String folder, String storage, String format, String savePath, String saveFile, String pair, Boolean masters, ArrayList<Integer> elements) {
        this.name = name;
        this.folder = folder;
        this.storage = storage;
        this.format = format;
        this.savePath = savePath;
        this.saveFile = saveFile;
        this.pair = pair;
        this.masters = masters;
        this.elements = elements;
    }

    @Override
    public String toString() {
        return "{" +
                "'name': '" + name + '\'' +
                ", 'folder': '" + folder + '\'' +
                ", 'pair': '" + pair + '\'' +
                ", 'format': '" + format + '\'' +
                ", 'storage': '" + storage + '\'' +
                ", 'saveFile': '" + saveFile + '\'' +
                ", 'savePath': '" + savePath + '\'' +
                ", 'masters': '" + masters + '\'' +
                ", 'elements': '" + elements + '\'' +
                '}';
    }
}