/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoTECCFileChooserFilters;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Lenovo
 */
    public class SecureFilter extends FileFilter {

            private String extension;
            private String description;
            
            public SecureFilter(String extension, String description)
            {this.extension = extension;
            this.description=description;
            }
    
        @Override
        public boolean accept(File file) {
        return file.getName().endsWith(extension);
        }

        @Override
        public String getDescription() {
            return description + String.format(" (*%s)", extension);
        }

    };