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
import java.util.HashMap;

public class FileInfo {
    private String name;
    private String folder;
    private String storage;
    private String format;
    private String savePath;
    private String saveFile;
    private String pair;
    private String outformat;
    private Boolean masters = false;
    private ArrayList<Integer> elements = new ArrayList<>();
    private String separator = ",";
    private HashMap<String, ArrayList<String>> codelist = new HashMap<>();
    private HashMap<Integer, ArrayList<ArrayList<String>>> frontlists = new HashMap<>();
    private boolean optimizepdffontsize = false;


    public String getOutformat() {
        return outformat;
    }

    public void setOutformat(String outformat) {
        this.outformat = outformat;
    }

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

    public String getSeparator() {
        return separator;
    }

    public void setSeparator(String separator) {
        this.separator = separator;
    }

    public HashMap<String, ArrayList<String>> getCodelist() {
        return codelist;
    }

    public void setCodelist(HashMap<String, ArrayList<String>> codelist) {
        this.codelist = codelist;
    }

    public HashMap<Integer, ArrayList<ArrayList<String>>> getFrontlists() {
        return frontlists;
    }

    public void setFrontlists(HashMap<Integer, ArrayList<ArrayList<String>>> frontlists) {
        this.frontlists = frontlists;
    }

    public boolean isOptimizepdffontsize() {
        return optimizepdffontsize;
    }

    public void setOptimizepdffontsize(boolean optimizepdffontsize) {
        this.optimizepdffontsize = optimizepdffontsize;
    }

    public FileInfo(String name, String folder, String storage, String format, String savePath, String saveFile, String pair, Boolean masters, String outformat) {
        this.name = name;
        this.folder = folder;
        this.storage = storage;
        this.format = format;
        this.savePath = savePath;
        this.saveFile = saveFile;
        this.pair = pair;
        this.masters = masters;
        this.outformat = outformat;
    }

    public FileInfo(String pair, String format, String outformat, String storage, String name, String folder, String savePath,
                    String saveFile, Boolean masters, ArrayList<Integer> elements, String separator,
                    HashMap<String, ArrayList<String>> codelist, HashMap<Integer, ArrayList<ArrayList<String>>> frontlists, boolean optimizepdffontsize) {
        this.pair = pair;
        this.format = format;
        this.outformat = outformat;
        this.storage = storage;
        this.name = name;
        this.folder = folder;
        this.savePath = savePath;
        this.saveFile = saveFile;
        this.masters = masters;
        this.elements = elements;
        this.separator = separator;
        this.codelist = codelist;
        this.frontlists = frontlists;
        this.optimizepdffontsize = optimizepdffontsize;
    }

    @Override
    public String toString() {
        String codelist_string = "";
        for (String key : codelist.keySet()) {
            ArrayList<String> enter_comma = new ArrayList<>();
            for (String code: codelist.get(key)){
                enter_comma.add("'" + code + "'");
            }
            String enter_string = "[" + String.join(",", enter_comma) + "]";

            codelist_string = codelist_string +key + ":" + enter_string + ",";
        }
        codelist_string = "{" + codelist_string.substring(0, codelist_string.length()-1) + "}";

        String front_string = "";
        for (Integer key : frontlists.keySet()) {
            ArrayList<String> enter_comma_array = new ArrayList<>();
            for (ArrayList<String> code: frontlists.get(key)){
                ArrayList<String> enter_comma = new ArrayList<>();
                for (String line: code){
                    enter_comma.add("'" + line + "'");
                }
                enter_comma_array.add("["+ String.join(",", enter_comma)+"]");
            }
            String enter_string = "[" + String.join(",", String.join(",", enter_comma_array)) + "]";

            front_string = front_string + key + ":" + enter_string + ",";
        }
        front_string = "{" + front_string.substring(0, front_string.length()-1) + "}";


        return "[{" +
                "'pair': '" + pair + "'" +
                ", 'format': '" + format + "'" +
                ", 'outformat': '" + outformat + "'" +
                ", 'storage': '" + storage + "'" +
                ", 'name': '" + name + "'" +
                ", 'folder': '" + folder + "'" +
                ", 'savePath': '" + savePath + "'" +
                ", 'saveFile': '" + saveFile + "'" +
                ", 'masters': " + masters +
                ", 'elements': " + elements +
                ", 'separator': '" + separator + "'" +
                ", 'shortcodedict': " + codelist_string +
                ", 'frontmatterdict': " +front_string +
                ", 'optimizepdffontsize': " + optimizepdffontsize +
                "}]";

    }
}