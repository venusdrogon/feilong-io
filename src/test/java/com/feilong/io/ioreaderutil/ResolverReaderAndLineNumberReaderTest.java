/*
 * Copyright (C) 2008 feilong
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.feilong.io.ioreaderutil;

import java.io.Reader;

import org.junit.Test;

import com.feilong.io.IOReaderUtil;
import com.feilong.io.LineNumberReaderResolver;
import com.feilong.io.ReaderUtil;

/**
 * 
 * @author <a href="http://feitianbenyue.iteye.com/">feilong</a>
 * @since 1.11.5
 */
public class ResolverReaderAndLineNumberReaderTest{

    private final LineNumberReaderResolver lineNumberReaderResolver = new LineNumberReaderResolver(){

        @Override
        public boolean excute(int lineNumber,String line){
            return false;
        }
    };

    @Test(expected = NullPointerException.class)
    public void testReadFileToStringFilePathAndCharsetNameTestNull(){
        IOReaderUtil.resolverFile((Reader) null, lineNumberReaderResolver);
    }

    @Test(expected = NullPointerException.class)
    public void testReadFileToStringFilePathAndCharsetNameTestBlank(){
        IOReaderUtil.resolverFile(ReaderUtil.newStringReader("test"), null);
    }
}